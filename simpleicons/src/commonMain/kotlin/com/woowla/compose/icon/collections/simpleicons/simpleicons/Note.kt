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

public val Simpleicons.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = Builder(name = "Note", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.279f)
                curveToRelative(4.623f, 0.0f, 10.953f, -0.235f, 15.498f, -0.117f)
                curveToRelative(6.099f, 0.156f, 8.39f, 2.813f, 8.468f, 9.374f)
                curveToRelative(0.077f, 3.71f, 0.0f, 14.335f, 0.0f, 14.335f)
                horizontalLineToRelative(-6.598f)
                curveToRelative(0.0f, -9.296f, 0.04f, -10.83f, 0.0f, -13.759f)
                curveToRelative(-0.078f, -2.578f, -0.814f, -3.807f, -2.795f, -4.041f)
                curveToRelative(-2.097f, -0.235f, -7.975f, -0.04f, -7.975f, -0.04f)
                verticalLineToRelative(17.84f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _note!!
    }

private var _note: ImageVector? = null
