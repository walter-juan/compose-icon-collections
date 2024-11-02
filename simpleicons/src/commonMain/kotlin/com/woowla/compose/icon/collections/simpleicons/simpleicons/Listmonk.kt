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

public val Simpleicons.Listmonk: ImageVector
    get() {
        if (_listmonk != null) {
            return _listmonk!!
        }
        _listmonk = Builder(name = "Listmonk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                moveToRelative(0.0f, 5.195f)
                arcTo(6.805f, 6.805f, 0.0f, false, true, 18.805f, 12.0f)
                arcTo(6.805f, 6.805f, 0.0f, false, true, 12.0f, 18.805f)
                arcTo(6.805f, 6.805f, 0.0f, false, true, 5.195f, 12.0f)
                arcTo(6.805f, 6.805f, 0.0f, false, true, 12.0f, 5.195f)
            }
        }
        .build()
        return _listmonk!!
    }

private var _listmonk: ImageVector? = null
