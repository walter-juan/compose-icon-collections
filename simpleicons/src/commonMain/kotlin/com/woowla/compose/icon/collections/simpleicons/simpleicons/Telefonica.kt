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

public val Simpleicons.Telefonica: ImageVector
    get() {
        if (_telefonica != null) {
            return _telefonica!!
        }
        _telefonica = Builder(name = "Telefonica", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.162f, 3.581f)
                arcToRelative(3.581f, 3.581f, 0.0f, true, false, -7.162f, 0.0f)
                arcToRelative(3.581f, 3.581f, 0.0f, false, false, 7.162f, 0.0f)
                moveToRelative(8.419f, 0.0f)
                arcToRelative(3.581f, 3.581f, 0.0f, true, false, -7.162f, 0.0f)
                arcToRelative(3.581f, 3.581f, 0.0f, false, false, 7.162f, 0.0f)
                moveToRelative(8.419f, 0.0f)
                arcToRelative(3.581f, 3.581f, 0.0f, true, false, -7.162f, 0.0f)
                arcToRelative(3.581f, 3.581f, 0.0f, false, false, 7.162f, 0.0f)
                moveTo(15.581f, 12.0f)
                arcToRelative(3.581f, 3.581f, 0.0f, true, false, -7.162f, 0.0f)
                arcToRelative(3.581f, 3.581f, 0.0f, false, false, 7.162f, 0.0f)
                moveToRelative(0.0f, 8.419f)
                arcToRelative(3.581f, 3.581f, 0.0f, true, false, -7.162f, 0.0f)
                arcToRelative(3.581f, 3.581f, 0.0f, false, false, 7.162f, 0.0f)
            }
        }
        .build()
        return _telefonica!!
    }

private var _telefonica: ImageVector? = null
