package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.HexagonHalf: ImageVector
    get() {
        if (_hexagonHalf != null) {
            return _hexagonHalf!!
        }
        _hexagonHalf = Builder(name = "HexagonHalf", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.577f)
                verticalLineToRelative(6.846f)
                lineTo(8.0f, 15.0f)
                verticalLineTo(1.0f)
                close()
                moveTo(8.5f, 0.134f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.0f)
                lineToRelative(-6.0f, 3.577f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.5f, 0.866f)
                verticalLineToRelative(6.846f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, 0.866f)
                lineToRelative(6.0f, 3.577f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.0f)
                lineToRelative(6.0f, -3.577f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, -0.866f)
                verticalLineTo(4.577f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.5f, -0.866f)
                close()
            }
        }
        .build()
        return _hexagonHalf!!
    }

private var _hexagonHalf: ImageVector? = null
