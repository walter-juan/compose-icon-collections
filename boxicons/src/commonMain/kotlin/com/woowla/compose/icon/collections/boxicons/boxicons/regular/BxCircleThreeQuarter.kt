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

public val RegularGroup.BxCircleThreeQuarter: ImageVector
    get() {
        if (_bxCircleThreeQuarter != null) {
            return _bxCircleThreeQuarter!!
        }
        _bxCircleThreeQuarter = Builder(name = "BxCircleThreeQuarter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 17.07f, 7.07f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(17.66f, 17.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.06f, 13.0f)
                lineTo(13.0f, 13.0f)
                lineTo(13.0f, 4.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.66f, 13.6f)
                close()
            }
        }
        .build()
        return _bxCircleThreeQuarter!!
    }

private var _bxCircleThreeQuarter: ImageVector? = null
