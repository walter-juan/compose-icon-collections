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

public val Simpleicons.Ory: ImageVector
    get() {
        if (_ory != null) {
            return _ory!!
        }
        _ory = Builder(name = "Ory", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                moveToRelative(-6.0f, -0.75f)
                lineTo(6.0f, 3.0f)
                lineToRelative(6.0f, -3.0f)
                lineToRelative(6.0f, 3.0f)
                verticalLineToRelative(2.25f)
                lineToRelative(-6.0f, -3.0f)
                close()
                moveTo(18.0f, 18.75f)
                lineTo(18.0f, 21.0f)
                lineToRelative(-6.0f, 3.0f)
                lineToRelative(-6.0f, -3.0f)
                verticalLineToRelative(-2.25f)
                lineToRelative(6.0f, 3.0f)
                close()
            }
        }
        .build()
        return _ory!!
    }

private var _ory: ImageVector? = null
