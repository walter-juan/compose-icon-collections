package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Calendar2Fill: ImageVector
    get() {
        if (_calendar2Fill != null) {
            return _calendar2Fill!!
        }
        _calendar2Fill = Builder(name = "Calendar2Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(2.545f, 3.0f)
                horizontalLineToRelative(10.91f)
                curveToRelative(0.3f, 0.0f, 0.545f, 0.224f, 0.545f, 0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.276f, -0.244f, 0.5f, -0.546f, 0.5f)
                horizontalLineTo(2.545f)
                curveTo(2.245f, 5.0f, 2.0f, 4.776f, 2.0f, 4.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.276f, 0.244f, -0.5f, 0.545f, -0.5f)
            }
        }
        .build()
        return _calendar2Fill!!
    }

private var _calendar2Fill: ImageVector? = null
