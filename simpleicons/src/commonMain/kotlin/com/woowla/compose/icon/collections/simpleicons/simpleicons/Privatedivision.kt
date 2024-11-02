package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Privatedivision: ImageVector
    get() {
        if (_privatedivision != null) {
            return _privatedivision!!
        }
        _privatedivision = Builder(name = "Privatedivision", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.384f, 0.248f)
                arcTo(0.422f, 0.422f, 0.0f, false, false, 11.998f, 0.0f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, false, -0.387f, 0.248f)
                lineTo(6.172f, 12.002f)
                lineToRelative(5.441f, 11.752f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, false, 0.616f, 0.18f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, false, 0.157f, -0.18f)
                lineToRelative(5.443f, -11.752f)
                lineTo(12.384f, 0.248f)
                close()
                moveTo(11.998f, 18.697f)
                lineTo(8.897f, 12.002f)
                lineTo(11.998f, 5.305f)
                lineTo(15.098f, 12.002f)
                lineTo(11.998f, 18.697f)
                close()
            }
        }
        .build()
        return _privatedivision!!
    }

private var _privatedivision: ImageVector? = null
