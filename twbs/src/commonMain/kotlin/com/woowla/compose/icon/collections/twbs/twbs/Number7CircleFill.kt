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

public val Twbs.Number7CircleFill: ImageVector
    get() {
        if (_number7CircleFill != null) {
            return _number7CircleFill!!
        }
        _number7CircleFill = Builder(name = "Number7CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(5.37f, 5.11f)
                horizontalLineToRelative(3.972f)
                verticalLineToRelative(0.07f)
                lineTo(6.025f, 12.0f)
                horizontalLineTo(7.42f)
                lineToRelative(3.258f, -6.85f)
                verticalLineTo(4.002f)
                horizontalLineTo(5.369f)
                verticalLineToRelative(1.107f)
                close()
            }
        }
        .build()
        return _number7CircleFill!!
    }

private var _number7CircleFill: ImageVector? = null
