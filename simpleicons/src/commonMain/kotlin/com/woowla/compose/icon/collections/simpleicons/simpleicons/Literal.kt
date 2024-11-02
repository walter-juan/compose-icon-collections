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

public val Simpleicons.Literal: ImageVector
    get() {
        if (_literal != null) {
            return _literal!!
        }
        _literal = Builder(name = "Literal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.148f, 5.719f)
                lineToRelative(0.128f, -1.798f)
                lineToRelative(3.234f, 0.223f)
                lineToRelative(-1.52f, -2.902f)
                lineToRelative(1.63f, -0.836f)
                lineTo(16.176f, 3.4f)
                lineToRelative(1.966f, -2.75f)
                lineToRelative(1.495f, 1.05f)
                lineToRelative(-1.916f, 2.665f)
                lineToRelative(3.212f, 0.221f)
                lineToRelative(-0.128f, 1.797f)
                lineToRelative(-3.167f, -0.217f)
                lineToRelative(1.498f, 2.878f)
                lineToRelative(-1.628f, 0.836f)
                lineToRelative(-1.578f, -3.017f)
                lineToRelative(-1.99f, 2.771f)
                lineToRelative(-1.495f, -1.05f)
                lineTo(14.36f, 5.94f)
                close()
                moveTo(3.019f, 15.232f)
                lineTo(5.197f, 0.0f)
                lineToRelative(2.569f, 0.355f)
                lineToRelative(-1.817f, 12.708f)
                lineToRelative(5.978f, 0.825f)
                lineToRelative(-0.361f, 2.525f)
                close()
                moveTo(20.981f, 21.7f)
                lineTo(4.328f, 24.0f)
                lineToRelative(-0.36f, -2.524f)
                lineToRelative(16.652f, -2.3f)
                close()
            }
        }
        .build()
        return _literal!!
    }

private var _literal: ImageVector? = null
