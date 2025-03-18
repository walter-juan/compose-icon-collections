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

public val Simpleicons.Fortnite: ImageVector
    get() {
        if (_fortnite != null) {
            return _fortnite!!
        }
        _fortnite = Builder(name = "Fortnite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.767f, 14.171f)
                lineToRelative(0.097f, -5.05f)
                horizontalLineTo(12.4f)
                verticalLineTo(5.197f)
                horizontalLineToRelative(3.99f)
                lineTo(16.872f, 0.0f)
                horizontalLineTo(7.128f)
                verticalLineToRelative(24.0f)
                lineToRelative(5.271f, -0.985f)
                verticalLineTo(14.17f)
                close()
            }
        }
        .build()
        return _fortnite!!
    }

private var _fortnite: ImageVector? = null
