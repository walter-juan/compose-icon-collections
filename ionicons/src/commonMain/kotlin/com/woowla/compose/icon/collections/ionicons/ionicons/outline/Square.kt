package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.Square: ImageVector
    get() {
        if (_square != null) {
            return _square!!
        }
        _square = Builder(name = "Square", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 448.0f)
                horizontalLineTo(96.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineTo(96.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 96.0f, 64.0f)
                horizontalLineTo(416.0f)
                arcToRelative(32.09f, 32.09f, 0.0f, false, true, 32.0f, 32.0f)
                verticalLineTo(416.0f)
                arcTo(32.09f, 32.09f, 0.0f, false, true, 416.0f, 448.0f)
                close()
            }
        }
        .build()
        return _square!!
    }

private var _square: ImageVector? = null
