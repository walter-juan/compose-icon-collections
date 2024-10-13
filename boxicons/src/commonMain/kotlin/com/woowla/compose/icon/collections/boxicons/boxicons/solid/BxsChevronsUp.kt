package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsChevronsUp: ImageVector
    get() {
        if (_bxsChevronsUp != null) {
            return _bxsChevronsUp!!
        }
        _bxsChevronsUp = Builder(name = "BxsChevronsUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.879f)
                lineToRelative(-7.061f, 7.06f)
                lineToRelative(2.122f, 2.122f)
                lineTo(12.0f, 8.121f)
                lineToRelative(4.939f, 4.94f)
                lineToRelative(2.122f, -2.122f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.939f, 17.939f)
                lineToRelative(2.122f, 2.122f)
                lineTo(12.0f, 15.121f)
                lineToRelative(4.939f, 4.94f)
                lineToRelative(2.122f, -2.122f)
                lineTo(12.0f, 10.879f)
                close()
            }
        }
        .build()
        return _bxsChevronsUp!!
    }

private var _bxsChevronsUp: ImageVector? = null
