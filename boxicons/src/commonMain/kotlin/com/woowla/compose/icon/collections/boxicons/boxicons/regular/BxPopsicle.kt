package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxPopsicle: ImageVector
    get() {
        if (_bxPopsicle != null) {
            return _bxPopsicle!!
        }
        _bxPopsicle = Builder(name = "BxPopsicle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -4.94f, 2.0f)
                lineToRelative(-7.78f, 7.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.41f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(-3.54f, 3.53f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(3.53f, -3.54f)
                lineToRelative(3.54f, 3.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 0.0f)
                lineTo(20.0f, 13.94f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 15.0f, 2.0f)
                close()
                moveTo(18.54f, 12.54f)
                lineTo(11.47f, 19.6f)
                lineTo(8.65f, 16.77f)
                lineTo(7.23f, 15.35f)
                lineTo(4.4f, 12.52f)
                lineTo(11.47f, 5.45f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.08f, 7.08f)
                close()
            }
        }
        .build()
        return _bxPopsicle!!
    }

private var _bxPopsicle: ImageVector? = null
