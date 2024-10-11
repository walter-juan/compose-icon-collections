package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.BellLine: ImageVector
    get() {
        if (_bellLine != null) {
            return _bellLine!!
        }
        _bellLine = Builder(name = "BellLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.121f, 9.879f)
                curveTo(18.417f, 14.174f, 20.95f, 18.607f, 19.778f, 19.778f)
                curveTo(19.303f, 20.253f, 18.292f, 20.119f, 16.971f, 19.506f)
                curveTo(13.746f, 21.645f, 9.447f, 21.487f, 6.382f, 19.032f)
                lineTo(6.343f, 19.071f)
                lineTo(4.929f, 17.657f)
                lineTo(4.967f, 17.617f)
                curveTo(2.513f, 14.552f, 2.355f, 10.254f, 4.495f, 7.03f)
                curveTo(3.881f, 5.708f, 3.747f, 4.697f, 4.222f, 4.222f)
                curveTo(5.35f, 3.094f, 9.499f, 5.399f, 13.639f, 9.404f)
                lineTo(14.121f, 9.879f)
                close()
                moveTo(12.707f, 11.293f)
                curveTo(10.823f, 9.409f, 8.87f, 7.842f, 7.236f, 6.87f)
                lineTo(7.05f, 7.05f)
                curveTo(4.557f, 9.544f, 4.338f, 13.45f, 6.393f, 16.192f)
                lineTo(8.239f, 14.346f)
                curveTo(8.061f, 13.679f, 8.234f, 12.938f, 8.757f, 12.414f)
                curveTo(9.538f, 11.633f, 10.805f, 11.633f, 11.586f, 12.414f)
                curveTo(12.367f, 13.195f, 12.367f, 14.462f, 11.586f, 15.243f)
                curveTo(11.063f, 15.766f, 10.322f, 15.939f, 9.655f, 15.761f)
                lineTo(7.807f, 17.607f)
                curveTo(10.549f, 19.662f, 14.456f, 19.443f, 16.95f, 16.95f)
                lineTo(17.129f, 16.762f)
                lineTo(17.076f, 16.673f)
                curveTo(16.1f, 15.058f, 14.556f, 13.142f, 12.707f, 11.293f)
                close()
                moveTo(19.778f, 4.222f)
                curveTo(20.559f, 5.003f, 20.559f, 6.269f, 19.778f, 7.05f)
                curveTo(19.725f, 7.103f, 19.67f, 7.152f, 19.614f, 7.198f)
                curveTo(21.206f, 9.715f, 21.427f, 12.852f, 20.276f, 15.543f)
                curveTo(19.899f, 14.806f, 19.435f, 14.032f, 18.89f, 13.237f)
                curveTo(19.279f, 11.06f, 18.633f, 8.733f, 16.95f, 7.05f)
                curveTo(15.267f, 5.367f, 12.94f, 4.72f, 10.763f, 5.11f)
                curveTo(9.968f, 4.565f, 9.193f, 4.1f, 8.457f, 3.724f)
                curveTo(11.148f, 2.573f, 14.285f, 2.794f, 16.804f, 4.387f)
                curveTo(16.848f, 4.33f, 16.897f, 4.275f, 16.95f, 4.222f)
                curveTo(17.731f, 3.441f, 18.997f, 3.441f, 19.778f, 4.222f)
                close()
            }
        }
        .build()
        return _bellLine!!
    }

private var _bellLine: ImageVector? = null
