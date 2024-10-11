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

public val LogosGroup.Telegram2Fill: ImageVector
    get() {
        if (_telegram2Fill != null) {
            return _telegram2Fill!!
        }
        _telegram2Fill = Builder(name = "Telegram2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.148f, 11.81f)
                curveTo(7.395f, 9.524f, 10.894f, 8.017f, 12.645f, 7.288f)
                curveTo(17.643f, 5.209f, 18.682f, 4.848f, 19.359f, 4.836f)
                curveTo(19.508f, 4.833f, 19.841f, 4.87f, 20.057f, 5.045f)
                curveTo(20.239f, 5.193f, 20.289f, 5.393f, 20.313f, 5.533f)
                curveTo(20.337f, 5.673f, 20.367f, 5.992f, 20.343f, 6.241f)
                curveTo(20.072f, 9.088f, 18.9f, 15.995f, 18.304f, 19.183f)
                curveTo(18.051f, 20.531f, 17.555f, 20.984f, 17.074f, 21.028f)
                curveTo(16.028f, 21.124f, 15.234f, 20.337f, 14.222f, 19.674f)
                curveTo(12.638f, 18.635f, 11.743f, 17.989f, 10.205f, 16.975f)
                curveTo(8.428f, 15.804f, 9.58f, 15.16f, 10.593f, 14.108f)
                curveTo(10.858f, 13.833f, 15.464f, 9.644f, 15.553f, 9.264f)
                curveTo(15.564f, 9.216f, 15.574f, 9.039f, 15.469f, 8.946f)
                curveTo(15.364f, 8.852f, 15.208f, 8.884f, 15.096f, 8.91f)
                curveTo(14.937f, 8.946f, 12.406f, 10.618f, 7.504f, 13.928f)
                curveTo(6.785f, 14.421f, 6.135f, 14.662f, 5.552f, 14.649f)
                curveTo(4.909f, 14.635f, 3.673f, 14.286f, 2.754f, 13.987f)
                curveTo(1.626f, 13.62f, 0.73f, 13.427f, 0.808f, 12.804f)
                curveTo(0.849f, 12.48f, 1.295f, 12.149f, 2.148f, 11.81f)
                close()
            }
        }
        .build()
        return _telegram2Fill!!
    }

private var _telegram2Fill: ImageVector? = null
