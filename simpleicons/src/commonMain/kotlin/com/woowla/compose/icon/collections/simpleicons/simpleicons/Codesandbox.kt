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

public val Simpleicons.Codesandbox: ImageVector
    get() {
        if (_codesandbox != null) {
            return _codesandbox!!
        }
        _codesandbox = Builder(name = "Codesandbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.455f)
                horizontalLineTo(21.545f)
                verticalLineTo(21.545f)
                horizontalLineTo(2.455f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _codesandbox!!
    }

private var _codesandbox: ImageVector? = null
