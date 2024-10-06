package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.874f, 3.486f)
                lineToRelative(-4.174f, 7.514f)
                horizontalLineToRelative(3.3f)
                curveToRelative(0.846f, 0.0f, 1.293f, 0.973f, 0.791f, 1.612f)
                lineToRelative(-0.074f, 0.085f)
                lineToRelative(-6.9f, 7.095f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, -10.21f, -10.974f)
                lineToRelative(7.746f, -6.58f)
                curveToRelative(0.722f, -0.614f, 1.814f, 0.028f, 1.628f, 0.958f)
                lineToRelative(-0.577f, 2.879f)
                lineToRelative(7.11f, -3.95f)
                curveToRelative(0.88f, -0.488f, 1.849f, 0.481f, 1.36f, 1.36f)
                moveToRelative(-12.374f, 7.515f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.495f, 3.308f)
                lineToRelative(-0.005f, 0.192f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, -3.5f)
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
