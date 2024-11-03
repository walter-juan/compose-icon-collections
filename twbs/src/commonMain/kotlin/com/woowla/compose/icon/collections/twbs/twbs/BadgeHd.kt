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

public val Twbs.BadgeHd: ImageVector
    get() {
        if (_badgeHd != null) {
            return _badgeHd!!
        }
        _badgeHd = Builder(name = "BadgeHd", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.396f, 11.0f)
                lineTo(7.396f, 5.001f)
                lineTo(6.209f, 5.001f)
                verticalLineToRelative(2.44f)
                lineTo(3.687f, 7.441f)
                lineTo(3.687f, 5.0f)
                lineTo(2.5f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.187f)
                lineTo(3.687f, 8.43f)
                horizontalLineToRelative(2.522f)
                lineTo(6.209f, 11.0f)
                close()
                moveTo(8.5f, 5.001f)
                lineTo(8.5f, 11.0f)
                horizontalLineToRelative(2.188f)
                curveToRelative(1.811f, 0.0f, 2.685f, -1.107f, 2.685f, -3.015f)
                curveToRelative(0.0f, -1.894f, -0.86f, -2.984f, -2.684f, -2.984f)
                close()
                moveTo(9.687f, 5.968f)
                horizontalLineToRelative(0.843f)
                curveToRelative(1.112f, 0.0f, 1.622f, 0.686f, 1.622f, 2.04f)
                curveToRelative(0.0f, 1.353f, -0.505f, 2.02f, -1.622f, 2.02f)
                horizontalLineToRelative(-0.843f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _badgeHd!!
    }

private var _badgeHd: ImageVector? = null
