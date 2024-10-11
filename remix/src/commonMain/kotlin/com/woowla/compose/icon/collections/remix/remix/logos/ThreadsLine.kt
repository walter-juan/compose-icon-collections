package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.ThreadsLine: ImageVector
    get() {
        if (_threadsLine != null) {
            return _threadsLine!!
        }
        _threadsLine = Builder(name = "ThreadsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.184f, 1.41f)
                lineTo(12.182f, 1.41f)
                curveTo(9.09f, 1.432f, 6.7f, 2.473f, 5.094f, 4.516f)
                curveTo(3.666f, 6.331f, 2.935f, 8.864f, 2.91f, 12.007f)
                verticalLineTo(12.008f)
                curveTo(2.935f, 15.151f, 3.666f, 17.67f, 5.094f, 19.485f)
                curveTo(6.7f, 21.527f, 9.103f, 22.569f, 12.195f, 22.59f)
                horizontalLineTo(12.196f)
                curveTo(14.944f, 22.571f, 16.893f, 21.85f, 18.499f, 20.246f)
                curveTo(20.603f, 18.143f, 20.541f, 15.505f, 19.846f, 13.883f)
                curveTo(19.316f, 12.649f, 18.271f, 11.662f, 16.87f, 11.048f)
                curveTo(16.689f, 8.063f, 15.01f, 6.322f, 12.25f, 6.304f)
                curveTo(10.619f, 6.294f, 9.148f, 7.024f, 8.247f, 8.391f)
                lineTo(9.902f, 9.527f)
                curveTo(10.435f, 8.718f, 11.279f, 8.328f, 12.237f, 8.337f)
                curveTo(13.624f, 8.346f, 14.536f, 9.111f, 14.792f, 10.454f)
                curveTo(14.02f, 10.333f, 13.19f, 10.298f, 12.308f, 10.349f)
                curveTo(9.668f, 10.501f, 7.94f, 12.061f, 8.055f, 14.224f)
                curveTo(8.176f, 16.486f, 10.367f, 17.719f, 12.448f, 17.605f)
                curveTo(14.94f, 17.468f, 16.421f, 15.629f, 16.772f, 13.284f)
                curveTo(17.349f, 13.658f, 17.775f, 14.134f, 18.016f, 14.697f)
                curveTo(18.456f, 15.722f, 18.484f, 17.413f, 17.101f, 18.795f)
                curveTo(15.884f, 20.011f, 14.421f, 20.541f, 12.189f, 20.557f)
                curveTo(9.714f, 20.539f, 7.857f, 19.746f, 6.652f, 18.214f)
                curveTo(5.52f, 16.775f, 4.928f, 14.688f, 4.906f, 12.0f)
                curveTo(4.928f, 9.312f, 5.52f, 7.225f, 6.652f, 5.787f)
                curveTo(7.857f, 4.254f, 9.714f, 3.462f, 12.189f, 3.443f)
                curveTo(14.682f, 3.462f, 16.573f, 4.258f, 17.825f, 5.799f)
                curveTo(18.516f, 6.649f, 18.949f, 7.665f, 19.238f, 8.714f)
                lineTo(21.178f, 8.197f)
                curveTo(20.815f, 6.859f, 20.241f, 5.584f, 19.363f, 4.503f)
                curveTo(17.71f, 2.469f, 15.282f, 1.432f, 12.184f, 1.41f)
                close()
                moveTo(12.42f, 12.378f)
                curveTo(13.304f, 12.327f, 14.124f, 12.383f, 14.852f, 12.535f)
                curveTo(14.711f, 14.112f, 14.059f, 15.481f, 12.34f, 15.575f)
                curveTo(11.228f, 15.638f, 10.103f, 15.141f, 10.048f, 14.114f)
                curveTo(10.008f, 13.35f, 10.573f, 12.485f, 12.42f, 12.378f)
                close()
            }
        }
        .build()
        return _threadsLine!!
    }

private var _threadsLine: ImageVector? = null
