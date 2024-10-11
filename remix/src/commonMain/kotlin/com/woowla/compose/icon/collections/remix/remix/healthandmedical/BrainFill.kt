package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.BrainFill: ImageVector
    get() {
        if (_brainFill != null) {
            return _brainFill!!
        }
        _brainFill = Builder(name = "BrainFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.535f)
                curveTo(10.412f, 2.195f, 9.729f, 2.0f, 9.0f, 2.0f)
                curveTo(6.791f, 2.0f, 5.0f, 3.791f, 5.0f, 6.0f)
                verticalLineTo(7.774f)
                curveTo(4.149f, 8.116f, 3.451f, 8.648f, 2.941f, 9.349f)
                curveTo(2.292f, 10.241f, 2.0f, 11.335f, 2.0f, 12.5f)
                curveTo(2.0f, 14.061f, 2.795f, 15.436f, 4.0f, 16.242f)
                verticalLineTo(17.5f)
                curveTo(4.0f, 19.985f, 6.015f, 22.0f, 8.5f, 22.0f)
                curveTo(9.425f, 22.0f, 10.285f, 21.721f, 11.0f, 21.242f)
                verticalLineTo(17.5f)
                curveTo(11.0f, 16.167f, 10.67f, 15.315f, 10.14f, 14.741f)
                curveTo(9.597f, 14.153f, 8.716f, 13.717f, 7.336f, 13.486f)
                lineTo(7.664f, 11.514f)
                curveTo(8.966f, 11.731f, 10.106f, 12.137f, 11.0f, 12.827f)
                verticalLineTo(2.535f)
                close()
                moveTo(13.0f, 2.535f)
                verticalLineTo(12.827f)
                curveTo(13.894f, 12.137f, 15.034f, 11.731f, 16.336f, 11.514f)
                lineTo(16.664f, 13.486f)
                curveTo(15.284f, 13.717f, 14.403f, 14.153f, 13.86f, 14.741f)
                curveTo(13.33f, 15.315f, 13.0f, 16.167f, 13.0f, 17.5f)
                verticalLineTo(21.242f)
                curveTo(13.715f, 21.721f, 14.575f, 22.0f, 15.5f, 22.0f)
                curveTo(17.985f, 22.0f, 20.0f, 19.985f, 20.0f, 17.5f)
                verticalLineTo(16.242f)
                curveTo(21.205f, 15.436f, 22.0f, 14.061f, 22.0f, 12.5f)
                curveTo(22.0f, 11.335f, 21.708f, 10.241f, 21.059f, 9.349f)
                curveTo(20.549f, 8.648f, 19.851f, 8.116f, 19.0f, 7.774f)
                verticalLineTo(6.0f)
                curveTo(19.0f, 3.791f, 17.209f, 2.0f, 15.0f, 2.0f)
                curveTo(14.271f, 2.0f, 13.588f, 2.195f, 13.0f, 2.535f)
                close()
            }
        }
        .build()
        return _brainFill!!
    }

private var _brainFill: ImageVector? = null
