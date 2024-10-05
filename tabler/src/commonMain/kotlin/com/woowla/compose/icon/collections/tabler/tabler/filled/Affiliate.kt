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

public val FilledGroup.Affiliate: ImageVector
    get() {
        if (_affiliate != null) {
            return _affiliate!!
        }
        _affiliate = Builder(name = "Affiliate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.912f, 4.828f)
                lineToRelative(-4.556f, 4.555f)
                arcToRelative(5.475f, 5.475f, 0.0f, false, true, 0.936f, 3.714f)
                lineToRelative(2.624f, 0.787f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.575f, 1.916f)
                lineToRelative(-2.623f, -0.788f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -10.39f, -2.29f)
                lineToRelative(-0.004f, -0.222f)
                lineToRelative(0.004f, -0.221f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 2.984f, -4.673f)
                lineToRelative(-0.788f, -2.624f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, true, -2.194f, -2.304f)
                lineToRelative(-0.006f, -0.178f)
                lineToRelative(0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 4.111f, 2.071f)
                lineToRelative(0.787f, 2.625f)
                arcToRelative(5.475f, 5.475f, 0.0f, false, true, 3.714f, 0.936f)
                lineToRelative(4.555f, -4.556f)
                arcToRelative(2.487f, 2.487f, 0.0f, false, true, -0.167f, -0.748f)
                lineToRelative(-0.005f, -0.164f)
                lineToRelative(0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.495f, -2.336f)
                close()
            }
        }
        .build()
        return _affiliate!!
    }

private var _affiliate: ImageVector? = null
