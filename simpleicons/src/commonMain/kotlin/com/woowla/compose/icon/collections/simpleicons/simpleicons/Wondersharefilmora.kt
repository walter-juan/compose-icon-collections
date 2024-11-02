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

public val Simpleicons.Wondersharefilmora: ImageVector
    get() {
        if (_wondersharefilmora != null) {
            return _wondersharefilmora!!
        }
        _wondersharefilmora = Builder(name = "Wondersharefilmora", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.475f, 0.0f)
                arcTo(5.463f, 5.463f, 0.0f, false, false, 0.0f, 5.475f)
                verticalLineToRelative(13.05f)
                arcTo(5.463f, 5.463f, 0.0f, false, false, 5.475f, 24.0f)
                horizontalLineToRelative(13.05f)
                arcTo(5.463f, 5.463f, 0.0f, false, false, 24.0f, 18.525f)
                lineTo(24.0f, 5.475f)
                arcTo(5.463f, 5.463f, 0.0f, false, false, 18.525f, 0.0f)
                lineTo(5.475f, 0.0f)
                close()
                moveTo(10.027f, 3.6f)
                lineTo(14.053f, 7.629f)
                lineTo(9.436f, 12.252f)
                lineTo(9.414f, 12.229f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, -0.158f, -1.339f)
                lineTo(5.999f, 7.63f)
                lineToRelative(4.028f, -4.03f)
                close()
                moveTo(14.528f, 8.0f)
                lineToRelative(4.027f, 4.03f)
                lineToRelative(-8.528f, 8.536f)
                lineTo(6.0f, 16.536f)
                lineTo(14.528f, 8.0f)
                close()
            }
        }
        .build()
        return _wondersharefilmora!!
    }

private var _wondersharefilmora: ImageVector? = null
