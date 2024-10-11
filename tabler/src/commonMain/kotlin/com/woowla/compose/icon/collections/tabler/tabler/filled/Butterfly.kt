package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.117f, 6.244f)
                lineToRelative(0.228f, 0.076f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.24f, 9.738f)
                lineToRelative(-0.063f, 0.039f)
                lineToRelative(0.02f, 0.034f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.101f, 3.533f)
                lineToRelative(-0.093f, 0.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.55f, 1.608f)
                verticalLineToRelative(-14.857f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 4.118f, -0.36f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.505f, 6.0f)
                curveToRelative(0.885f, 0.0f, 1.736f, 0.21f, 2.495f, 0.597f)
                verticalLineToRelative(14.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.012f, 0.41f)
                lineToRelative(-0.196f, 0.045f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.424f, -5.587f)
                lineToRelative(0.118f, -0.238f)
                lineToRelative(-0.035f, -0.023f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.397f, -5.258f)
                lineToRelative(0.034f, -0.233f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.417f, -4.583f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.445f, 2.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, 1.664f)
                lineToRelative(-3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.11f, 0.0f)
                lineToRelative(-3.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, -1.664f)
                lineToRelative(2.444f, 1.63f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
