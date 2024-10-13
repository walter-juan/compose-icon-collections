package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlTrello: ImageVector
    get() {
        if (_bxlTrello != null) {
            return _bxlTrello!!
        }
        _bxlTrello = Builder(name = "BxlTrello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 3.0f)
                lineTo(5.25f, 3.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 3.0f, 5.25f)
                verticalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 5.25f, 21.0f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 21.0f, 18.75f)
                lineTo(21.0f, 5.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 18.75f, 3.0f)
                close()
                moveTo(10.83f, 16.635f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, -1.08f, 1.08f)
                lineTo(6.42f, 17.715f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, -1.08f, -1.08f)
                lineTo(5.34f, 6.42f)
                curveToRelative(0.0f, -0.597f, 0.483f, -1.08f, 1.08f, -1.08f)
                horizontalLineToRelative(3.33f)
                curveToRelative(0.596f, 0.0f, 1.08f, 0.483f, 1.08f, 1.08f)
                verticalLineToRelative(10.215f)
                close()
                moveTo(18.66f, 12.135f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, -1.08f, 1.08f)
                horizontalLineToRelative(-3.33f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, -1.08f, -1.08f)
                lineTo(13.17f, 6.42f)
                curveToRelative(0.0f, -0.597f, 0.484f, -1.08f, 1.08f, -1.08f)
                horizontalLineToRelative(3.33f)
                curveToRelative(0.597f, 0.0f, 1.08f, 0.483f, 1.08f, 1.08f)
                verticalLineToRelative(5.715f)
                close()
            }
        }
        .build()
        return _bxlTrello!!
    }

private var _bxlTrello: ImageVector? = null
