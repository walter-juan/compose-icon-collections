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

public val Simpleicons.Elevenlabs: ImageVector
    get() {
        if (_elevenlabs != null) {
            return _elevenlabs!!
        }
        _elevenlabs = Builder(name = "Elevenlabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.603f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(4.932f)
                lineTo(9.535f, 0.0f)
                close()
                moveTo(14.465f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(4.932f)
                lineTo(19.396f, 0.0f)
                close()
            }
        }
        .build()
        return _elevenlabs!!
    }

private var _elevenlabs: ImageVector? = null
