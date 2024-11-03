package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.04f, 0.303f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 0.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.2f, 0.0f, 0.38f, 0.12f, 0.46f, 0.303f)
                lineToRelative(3.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.363f, 0.687f)
                horizontalLineToRelative(-0.002f)
                quadToRelative(-0.225f, 0.044f, -0.45f, 0.081f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, true, -4.645f, 0.425f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(8.495f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, true, -4.645f, -0.425f)
                quadToRelative(-0.225f, -0.036f, -0.45f, -0.08f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.362f, -0.688f)
                lineToRelative(3.0f, -7.0f)
                close()
                moveTo(3.21f, 7.116f)
                arcTo(31.0f, 31.0f, 0.0f, false, false, 8.0f, 7.5f)
                arcToRelative(31.0f, 31.0f, 0.0f, false, false, 4.791f, -0.384f)
                lineTo(10.171f, 1.0f)
                horizontalLineTo(5.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.493f, 12.574f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.411f, 0.575f)
                curveToRelative(-0.712f, 0.118f, -1.28f, 0.295f, -1.655f, 0.493f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.37f, 0.265f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.052f, 0.075f)
                lineToRelative(-0.001f, 0.004f)
                lineToRelative(-0.004f, 0.01f)
                verticalLineTo(14.0f)
                lineToRelative(0.002f, 0.008f)
                lineToRelative(0.016f, 0.033f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.145f, 0.15f)
                curveToRelative(0.165f, 0.13f, 0.435f, 0.27f, 0.813f, 0.395f)
                curveToRelative(0.751f, 0.25f, 1.82f, 0.414f, 3.024f, 0.414f)
                reflectiveCurveToRelative(2.273f, -0.163f, 3.024f, -0.414f)
                curveToRelative(0.378f, -0.126f, 0.648f, -0.265f, 0.813f, -0.395f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.146f, -0.15f)
                lineToRelative(0.015f, -0.033f)
                lineTo(12.0f, 14.0f)
                verticalLineToRelative(-0.004f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.057f, -0.09f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.37f, -0.264f)
                curveToRelative(-0.376f, -0.198f, -0.943f, -0.375f, -1.655f, -0.493f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.164f, -0.986f)
                curveToRelative(0.77f, 0.127f, 1.452f, 0.328f, 1.957f, 0.594f)
                curveTo(12.5f, 13.0f, 13.0f, 13.4f, 13.0f, 14.0f)
                curveToRelative(0.0f, 0.426f, -0.26f, 0.752f, -0.544f, 0.977f)
                curveToRelative(-0.29f, 0.228f, -0.68f, 0.413f, -1.116f, 0.558f)
                curveToRelative(-0.878f, 0.293f, -2.059f, 0.465f, -3.34f, 0.465f)
                reflectiveCurveToRelative(-2.462f, -0.172f, -3.34f, -0.465f)
                curveToRelative(-0.436f, -0.145f, -0.826f, -0.33f, -1.116f, -0.558f)
                curveTo(3.26f, 14.752f, 3.0f, 14.426f, 3.0f, 14.0f)
                curveToRelative(0.0f, -0.599f, 0.5f, -1.0f, 0.961f, -1.243f)
                curveToRelative(0.505f, -0.266f, 1.187f, -0.467f, 1.957f, -0.594f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.575f, 0.411f)
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
