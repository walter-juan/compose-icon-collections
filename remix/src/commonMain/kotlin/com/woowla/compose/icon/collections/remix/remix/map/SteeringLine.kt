package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.SteeringLine: ImageVector
    get() {
        if (_steeringLine != null) {
            return _steeringLine!!
        }
        _steeringLine = Builder(name = "SteeringLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.799f, 14.001f)
                curveTo(20.963f, 18.117f, 17.6f, 21.315f, 13.399f, 21.903f)
                lineTo(13.399f, 19.878f)
                curveTo(16.493f, 19.332f, 18.973f, 17.009f, 19.747f, 14.0f)
                lineTo(21.799f, 14.001f)
                close()
                moveTo(4.252f, 14.0f)
                curveTo(5.018f, 16.976f, 7.452f, 19.281f, 10.499f, 19.86f)
                verticalLineTo(21.888f)
                curveTo(6.346f, 21.263f, 3.029f, 18.084f, 2.2f, 14.001f)
                lineTo(4.252f, 14.0f)
                close()
                moveTo(17.999f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.999f)
                curveTo(13.945f, 13.0f, 13.081f, 13.816f, 13.005f, 14.851f)
                lineTo(12.999f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.999f)
                verticalLineTo(15.0f)
                curveTo(10.999f, 13.946f, 10.184f, 13.082f, 9.149f, 13.005f)
                lineTo(8.999f, 13.0f)
                horizontalLineTo(5.999f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.999f)
                close()
                moveTo(11.999f, 2.0f)
                curveTo(17.185f, 2.0f, 21.448f, 5.947f, 21.95f, 11.0f)
                lineTo(19.938f, 11.0f)
                curveTo(19.445f, 7.054f, 16.079f, 4.0f, 11.999f, 4.0f)
                curveTo(7.92f, 4.0f, 4.553f, 7.054f, 4.061f, 11.0f)
                lineTo(2.049f, 11.0f)
                curveTo(2.551f, 5.947f, 6.814f, 2.0f, 11.999f, 2.0f)
                close()
            }
        }
        .build()
        return _steeringLine!!
    }

private var _steeringLine: ImageVector? = null
