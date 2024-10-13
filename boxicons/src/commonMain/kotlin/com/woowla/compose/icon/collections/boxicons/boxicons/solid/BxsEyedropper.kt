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

public val SolidGroup.BxsEyedropper: ImageVector
    get() {
        if (_bxsEyedropper != null) {
            return _bxsEyedropper!!
        }
        _bxsEyedropper = Builder(name = "BxsEyedropper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 15.76f)
                lineToRelative(-1.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.75f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.49f, 0.0f)
                lineToRelative(4.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.47f, -0.26f)
                lineTo(17.0f, 11.41f)
                lineToRelative(1.29f, 1.3f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-1.3f, -1.29f)
                lineTo(21.0f, 7.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.82f)
                lineTo(19.41f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.82f, 0.0f)
                lineTo(14.0f, 5.59f)
                lineToRelative(-1.3f, -1.3f)
                lineToRelative(-1.42f, 1.42f)
                lineTo(12.58f, 7.0f)
                lineToRelative(-8.29f, 8.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, 0.47f)
                close()
                moveTo(5.87f, 16.51f)
                lineTo(14.0f, 8.42f)
                lineTo(15.58f, 10.0f)
                lineToRelative(-8.09f, 8.1f)
                lineToRelative(-2.12f, 0.53f)
                close()
            }
        }
        .build()
        return _bxsEyedropper!!
    }

private var _bxsEyedropper: ImageVector? = null
