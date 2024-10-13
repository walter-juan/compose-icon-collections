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

public val SolidGroup.BxsMedal: ImageVector
    get() {
        if (_bxsMedal != null) {
            return _bxsMedal!!
        }
        _bxsMedal = Builder(name = "BxsMedal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.059f)
                arcToRelative(8.946f, 8.946f, 0.0f, false, true, 4.0f, 1.459f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(11.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(5.518f)
                arcToRelative(8.946f, 8.946f, 0.0f, false, true, 4.0f, -1.459f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, -14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 14.0f)
                close()
                moveTo(10.775f, 13.481f)
                lineTo(12.0f, 11.0f)
                lineToRelative(1.225f, 2.481f)
                lineToRelative(2.738f, 0.397f)
                lineToRelative(-1.981f, 1.932f)
                lineToRelative(0.468f, 2.727f)
                lineTo(12.0f, 17.25f)
                lineToRelative(-2.449f, 1.287f)
                lineToRelative(0.468f, -2.727f)
                lineToRelative(-1.981f, -1.932f)
                lineToRelative(2.737f, -0.397f)
                close()
            }
        }
        .build()
        return _bxsMedal!!
    }

private var _bxsMedal: ImageVector? = null
