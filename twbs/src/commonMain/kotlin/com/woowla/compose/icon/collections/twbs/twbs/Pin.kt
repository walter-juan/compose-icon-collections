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

public val Twbs.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
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
                lineTo(7.5f, 10.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                curveToRelative(0.0f, -0.973f, 0.64f, -1.725f, 1.17f, -2.189f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 5.0f, 6.708f)
                lineTo(5.0f, 2.277f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.354f, -0.298f)
                curveTo(4.342f, 1.674f, 4.0f, 1.179f, 4.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, -0.354f)
                moveToRelative(1.58f, 1.408f)
                lineToRelative(-0.002f, -0.001f)
                close()
                moveTo(5.724f, 1.553f)
                lineTo(5.726f, 1.554f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 2.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.276f, 0.447f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.012f, 0.007f)
                lineToRelative(-0.054f, 0.03f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.827f, 0.58f)
                curveToRelative(-0.318f, 0.278f, -0.585f, 0.596f, -0.725f, 0.936f)
                horizontalLineToRelative(7.792f)
                curveToRelative(-0.14f, -0.34f, -0.407f, -0.658f, -0.725f, -0.936f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.881f, -0.61f)
                lineToRelative(-0.012f, -0.006f)
                horizontalLineToRelative(-0.002f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 7.0f)
                lineTo(10.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.295f, -0.458f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 0.351f, -0.271f)
                curveToRelative(0.08f, -0.08f, 0.155f, -0.17f, 0.214f, -0.271f)
                lineTo(5.14f, 1.0f)
                quadToRelative(0.091f, 0.15f, 0.214f, 0.271f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 0.37f, 0.282f)
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
