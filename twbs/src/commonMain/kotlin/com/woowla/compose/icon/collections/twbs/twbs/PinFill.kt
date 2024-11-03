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

public val Twbs.PinFill: ImageVector
    get() {
        if (_pinFill != null) {
            return _pinFill!!
        }
        _pinFill = Builder(name = "PinFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.146f, 0.146f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 0.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                curveToRelative(0.0f, 0.68f, -0.342f, 1.174f, -0.646f, 1.479f)
                curveToRelative(-0.126f, 0.125f, -0.25f, 0.224f, -0.354f, 0.298f)
                verticalLineToRelative(4.431f)
                lineToRelative(0.078f, 0.048f)
                curveToRelative(0.203f, 0.127f, 0.476f, 0.314f, 0.751f, 0.555f)
                curveTo(12.36f, 7.775f, 13.0f, 8.527f, 13.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.276f, -0.224f, 1.5f, -0.5f, 1.5f)
                reflectiveCurveToRelative(-0.5f, -1.224f, -0.5f, -1.5f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                curveToRelative(0.0f, -0.973f, 0.64f, -1.725f, 1.17f, -2.189f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 5.0f, 6.708f)
                verticalLineTo(2.277f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.354f, -0.298f)
                curveTo(4.342f, 1.674f, 4.0f, 1.179f, 4.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, -0.354f)
            }
        }
        .build()
        return _pinFill!!
    }

private var _pinFill: ImageVector? = null
