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

public val SharpGroup.ChevronCollapse: ImageVector
    get() {
        if (_chevronCollapse != null) {
            return _chevronCollapse!!
        }
        _chevronCollapse = Builder(name = "ChevronCollapse", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.14f, 108.51f)
                lineTo(256.0f, 241.85f)
                lineToRelative(153.85f, -133.34f)
                lineToRelative(-31.44f, -36.27f)
                lineTo(256.0f, 178.34f)
                lineTo(133.58f, 72.24f)
                lineToRelative(-31.44f, 36.27f)
                close()
                moveTo(102.14f, 403.49f)
                lineTo(256.0f, 270.14f)
                lineToRelative(153.85f, 133.34f)
                lineToRelative(-31.44f, 36.27f)
                lineTo(256.0f, 333.66f)
                lineTo(133.58f, 439.76f)
                lineToRelative(-31.44f, -36.27f)
                close()
            }
        }
        .build()
        return _chevronCollapse!!
    }

private var _chevronCollapse: ImageVector? = null
