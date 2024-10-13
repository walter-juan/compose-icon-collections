package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPopsicle: ImageVector
    get() {
        if (_bxsPopsicle != null) {
            return _bxsPopsicle!!
        }
        _bxsPopsicle = Builder(name = "BxsPopsicle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.9f, 0.0f)
                lineToRelative(-7.82f, 7.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.41f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(-3.54f, 3.53f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(3.53f, -3.54f)
                lineToRelative(3.54f, 3.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 0.0f)
                lineTo(20.0f, 13.94f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 20.0f, 4.0f)
                close()
                moveTo(17.3f, 6.7f)
                arcToRelative(3.33f, 3.33f, 0.0f, false, false, -4.6f, 0.0f)
                lineToRelative(-1.06f, -1.06f)
                arcToRelative(4.76f, 4.76f, 0.0f, false, true, 6.72f, 0.0f)
                close()
            }
        }
        .build()
        return _bxsPopsicle!!
    }

private var _bxsPopsicle: ImageVector? = null
