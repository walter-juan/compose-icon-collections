package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

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
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 346.0f)
                lineToRelative(0.0f, -314.0f)
                lineToRelative(-44.0f, 0.0f)
                lineToRelative(0.0f, 90.0f)
                lineToRelative(-90.0f, 0.0f)
                lineToRelative(0.0f, 44.0f)
                lineToRelative(90.0f, 0.0f)
                lineToRelative(0.0f, 224.0f)
                lineToRelative(224.0f, 0.0f)
                lineToRelative(0.0f, 90.0f)
                lineToRelative(44.0f, 0.0f)
                lineToRelative(0.0f, -90.0f)
                lineToRelative(90.0f, 0.0f)
                lineToRelative(0.0f, -44.0f)
                lineToRelative(-314.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(346.0f, 320.0f)
                lineToRelative(44.0f, 0.0f)
                lineToRelative(0.0f, -198.0f)
                lineToRelative(-198.0f, 0.0f)
                lineToRelative(0.0f, 44.0f)
                lineToRelative(154.0f, 0.0f)
                lineToRelative(0.0f, 154.0f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
