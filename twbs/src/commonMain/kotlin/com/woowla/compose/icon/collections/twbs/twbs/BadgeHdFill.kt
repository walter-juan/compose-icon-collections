package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BadgeHdFill: ImageVector
    get() {
        if (_badgeHdFill != null) {
            return _badgeHdFill!!
        }
        _badgeHdFill = Builder(name = "BadgeHdFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.53f, 5.968f)
                horizontalLineToRelative(-0.843f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(0.843f)
                curveToRelative(1.117f, 0.0f, 1.622f, -0.667f, 1.622f, -2.02f)
                curveToRelative(0.0f, -1.354f, -0.51f, -2.04f, -1.622f, -2.04f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(7.396f, 5.001f)
                lineTo(7.396f, 11.0f)
                lineTo(6.209f, 11.0f)
                lineTo(6.209f, 8.43f)
                lineTo(3.687f, 8.43f)
                lineTo(3.687f, 11.0f)
                lineTo(2.5f, 11.0f)
                lineTo(2.5f, 5.001f)
                horizontalLineToRelative(1.187f)
                verticalLineToRelative(2.44f)
                horizontalLineToRelative(2.522f)
                lineTo(6.209f, 5.0f)
                horizontalLineToRelative(1.187f)
                close()
                moveTo(8.5f, 11.0f)
                lineTo(8.5f, 5.001f)
                horizontalLineToRelative(2.188f)
                curveToRelative(1.824f, 0.0f, 2.685f, 1.09f, 2.685f, 2.984f)
                curveTo(13.373f, 9.893f, 12.5f, 11.0f, 10.69f, 11.0f)
                close()
            }
        }
        .build()
        return _badgeHdFill!!
    }

private var _badgeHdFill: ImageVector? = null
