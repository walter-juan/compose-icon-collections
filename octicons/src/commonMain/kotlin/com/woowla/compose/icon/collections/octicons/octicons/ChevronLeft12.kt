package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.ChevronLeft12: ImageVector
    get() {
        if (_chevronLeft12 != null) {
            return _chevronLeft12!!
        }
        _chevronLeft12 = Builder(name = "ChevronLeft12", defaultWidth = 12.0.dp, defaultHeight =
                12.0.dp, viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.587f, 6.025f)
                curveToRelative(0.0f, 0.2f, 0.1f, 0.4f, 0.2f, 0.5f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.3f, 0.3f, 0.8f, 0.3f, 1.1f, 0.0f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.8f, 0.0f, -1.1f)
                lineToRelative(-2.7f, -2.7f)
                lineToRelative(2.7f, -2.7f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.8f, 0.0f, -1.1f)
                curveToRelative(-0.3f, -0.3f, -0.8f, -0.3f, -1.1f, 0.0f)
                lineToRelative(-3.2f, 3.2f)
                curveToRelative(-0.2f, 0.2f, -0.3f, 0.4f, -0.3f, 0.6f)
                close()
            }
        }
        .build()
        return _chevronLeft12!!
    }

private var _chevronLeft12: ImageVector? = null
