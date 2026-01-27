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

public val OthersGroup.FlowerLine: ImageVector
    get() {
        if (_flowerLine != null) {
            return _flowerLine!!
        }
        _flowerLine = Builder(name = "FlowerLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.076f)
                lineTo(12.455f, 2.309f)
                curveTo(14.221f, 3.211f, 15.733f, 4.538f, 16.857f, 6.155f)
                curveTo(17.785f, 5.714f, 18.779f, 5.389f, 19.819f, 5.198f)
                lineTo(21.0f, 4.981f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 17.97f, 16.971f, 22.0f, 12.0f, 22.0f)
                curveTo(7.029f, 22.0f, 3.0f, 17.971f, 3.0f, 13.0f)
                verticalLineTo(4.981f)
                lineTo(4.181f, 5.198f)
                curveTo(5.221f, 5.389f, 6.215f, 5.714f, 7.143f, 6.155f)
                curveTo(8.267f, 4.538f, 9.779f, 3.211f, 11.545f, 2.309f)
                lineTo(12.0f, 2.076f)
                close()
                moveTo(8.878f, 7.165f)
                curveTo(10.107f, 8.026f, 11.168f, 9.113f, 12.0f, 10.364f)
                curveTo(12.832f, 9.113f, 13.893f, 8.026f, 15.122f, 7.165f)
                curveTo(14.295f, 6.016f, 13.23f, 5.049f, 12.0f, 4.337f)
                curveTo(10.77f, 5.049f, 9.705f, 6.016f, 8.878f, 7.165f)
                close()
                moveTo(10.899f, 12.434f)
                curveTo(10.018f, 10.72f, 8.656f, 9.293f, 6.991f, 8.332f)
                curveTo(6.367f, 7.972f, 5.7f, 7.677f, 5.0f, 7.457f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 16.29f, 7.27f, 19.05f, 10.328f, 19.799f)
                curveTo(10.114f, 18.9f, 10.0f, 17.963f, 10.0f, 17.0f)
                curveTo(10.0f, 15.383f, 10.32f, 13.841f, 10.899f, 12.434f)
                close()
                moveTo(12.453f, 19.986f)
                curveTo(16.108f, 19.752f, 19.0f, 16.714f, 19.0f, 13.0f)
                verticalLineTo(7.457f)
                curveTo(18.3f, 7.677f, 17.633f, 7.972f, 17.009f, 8.332f)
                curveTo(14.013f, 10.062f, 12.0f, 13.296f, 12.0f, 17.0f)
                curveTo(12.0f, 18.041f, 12.159f, 19.044f, 12.453f, 19.986f)
                close()
            }
        }
        .build()
        return _flowerLine!!
    }

private var _flowerLine: ImageVector? = null
