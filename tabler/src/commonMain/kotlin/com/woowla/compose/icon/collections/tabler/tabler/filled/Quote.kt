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

public val FilledGroup.Quote: ImageVector
    get() {
        if (_quote != null) {
            return _quote!!
        }
        _quote = Builder(name = "Quote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.13f, -1.65f, 5.193f, -4.757f, 5.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.486f, -1.94f)
                curveToRelative(2.227f, -0.557f, 3.243f, -1.827f, 3.243f, -4.03f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.13f, -1.65f, 5.193f, -4.757f, 5.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.486f, -1.94f)
                curveToRelative(2.227f, -0.557f, 3.243f, -1.827f, 3.243f, -4.03f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _quote!!
    }

private var _quote: ImageVector? = null
