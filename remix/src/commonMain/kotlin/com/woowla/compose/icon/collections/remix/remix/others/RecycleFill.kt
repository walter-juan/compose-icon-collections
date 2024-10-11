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

public val OthersGroup.RecycleFill: ImageVector
    get() {
        if (_recycleFill != null) {
            return _recycleFill!!
        }
        _recycleFill = Builder(name = "RecycleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.561f, 12.099f)
                lineTo(21.093f, 14.75f)
                curveTo(22.059f, 16.424f, 21.486f, 18.565f, 19.812f, 19.531f)
                curveTo(19.279f, 19.838f, 18.676f, 20.0f, 18.062f, 20.0f)
                lineTo(15.999f, 20.0f)
                verticalLineTo(22.0f)
                lineTo(10.999f, 18.5f)
                lineTo(15.999f, 15.0f)
                verticalLineTo(17.0f)
                lineTo(18.062f, 17.0f)
                curveTo(18.149f, 17.0f, 18.236f, 16.977f, 18.312f, 16.933f)
                curveTo(18.524f, 16.81f, 18.612f, 16.555f, 18.532f, 16.332f)
                lineTo(18.494f, 16.25f)
                lineTo(16.963f, 13.599f)
                lineTo(19.561f, 12.099f)
                close()
                moveTo(7.736f, 9.384f)
                lineTo(8.267f, 15.464f)
                lineTo(6.536f, 14.465f)
                lineTo(5.504f, 16.25f)
                curveTo(5.46f, 16.326f, 5.437f, 16.412f, 5.437f, 16.5f)
                curveTo(5.437f, 16.746f, 5.614f, 16.95f, 5.847f, 16.992f)
                lineTo(5.937f, 17.0f)
                lineTo(8.999f, 17.0f)
                verticalLineTo(20.0f)
                lineTo(5.937f, 20.0f)
                curveTo(4.004f, 20.0f, 2.437f, 18.433f, 2.437f, 16.5f)
                curveTo(2.437f, 15.886f, 2.599f, 15.282f, 2.906f, 14.75f)
                lineTo(3.938f, 12.965f)
                lineTo(2.205f, 11.964f)
                lineTo(7.736f, 9.384f)
                close()
                moveTo(13.749f, 2.969f)
                curveTo(14.281f, 3.276f, 14.723f, 3.718f, 15.03f, 4.25f)
                lineTo(16.061f, 6.036f)
                lineTo(17.794f, 5.036f)
                lineTo(17.262f, 11.116f)
                lineTo(11.731f, 8.536f)
                lineTo(13.463f, 7.536f)
                lineTo(12.432f, 5.75f)
                curveTo(12.388f, 5.674f, 12.325f, 5.611f, 12.249f, 5.567f)
                curveTo(12.037f, 5.444f, 11.771f, 5.495f, 11.618f, 5.676f)
                lineTo(11.566f, 5.75f)
                lineTo(10.036f, 8.402f)
                lineTo(7.438f, 6.902f)
                lineTo(8.968f, 4.25f)
                curveTo(9.935f, 2.576f, 12.075f, 2.003f, 13.749f, 2.969f)
                close()
            }
        }
        .build()
        return _recycleFill!!
    }

private var _recycleFill: ImageVector? = null
