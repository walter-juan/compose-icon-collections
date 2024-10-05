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

public val FilledGroup.Windmill: ImageVector
    get() {
        if (_windmill != null) {
            return _windmill!!
        }
        _windmill = Builder(name = "Windmill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(3.292f, 0.0f, 6.0f, 2.435f, 6.0f, 5.5f)
                curveToRelative(0.0f, 1.337f, -0.515f, 2.554f, -1.369f, 3.5f)
                horizontalLineToRelative(4.369f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                curveToRelative(0.0f, 3.292f, -2.435f, 6.0f, -5.5f, 6.0f)
                curveToRelative(-1.336f, 0.0f, -2.553f, -0.515f, -3.5f, -1.368f)
                verticalLineToRelative(4.368f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                curveToRelative(-3.292f, 0.0f, -6.0f, -2.435f, -6.0f, -5.5f)
                curveToRelative(0.0f, -1.336f, 0.515f, -2.553f, 1.368f, -3.5f)
                horizontalLineToRelative(-4.368f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -3.292f, 2.435f, -6.0f, 5.5f, -6.0f)
                curveToRelative(1.337f, 0.0f, 2.554f, 0.515f, 3.5f, 1.369f)
                verticalLineToRelative(-4.369f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _windmill!!
    }

private var _windmill: ImageVector? = null
