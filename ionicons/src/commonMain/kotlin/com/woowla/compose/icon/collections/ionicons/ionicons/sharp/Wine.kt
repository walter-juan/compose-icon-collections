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

public val SharpGroup.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(453.0f, 112.0f)
                lineTo(453.0f, 66.33f)
                lineTo(60.75f, 66.33f)
                lineTo(60.75f, 112.0f)
                lineTo(235.88f, 288.0f)
                lineTo(235.88f, 406.0f)
                lineTo(124.75f, 406.0f)
                verticalLineToRelative(42.0f)
                lineTo(389.0f, 448.0f)
                lineTo(389.0f, 406.0f)
                lineTo(277.88f, 406.0f)
                lineTo(277.88f, 288.0f)
                close()
                moveTo(116.35f, 108.33f)
                horizontalLineToRelative(281.0f)
                lineToRelative(-37.81f, 38.0f)
                lineTo(154.16f, 146.33f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
