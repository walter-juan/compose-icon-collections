package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Barbell: ImageVector
    get() {
        if (_barbell != null) {
            return _barbell!!
        }
        _barbell = Builder(name = "Barbell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 176.0f)
                lineToRelative(-58.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-76.0f, 0.0f)
                lineToRelative(0.0f, 122.0f)
                lineToRelative(-212.0f, 0.0f)
                lineToRelative(0.0f, -122.0f)
                lineToRelative(-76.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-58.0f, 0.0f)
                lineToRelative(0.0f, 160.0f)
                lineToRelative(58.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(76.0f, 0.0f)
                lineToRelative(0.0f, -122.0f)
                lineToRelative(212.0f, 0.0f)
                lineToRelative(0.0f, 122.0f)
                lineToRelative(76.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(58.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _barbell!!
    }

private var _barbell: ImageVector? = null
