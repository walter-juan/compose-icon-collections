package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlDigitalocean: ImageVector
    get() {
        if (_bxlDigitalocean != null) {
            return _bxlDigitalocean!!
        }
        _bxlDigitalocean = Builder(name = "BxlDigitalocean", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 21.992f)
                verticalLineToRelative(-3.877f)
                curveToRelative(4.104f, 0.0f, 7.288f, -4.068f, 5.714f, -8.388f)
                arcToRelative(5.81f, 5.81f, 0.0f, false, false, -3.457f, -3.446f)
                curveToRelative(-4.319f, -1.563f, -8.389f, 1.61f, -8.389f, 5.714f)
                horizontalLineTo(2.008f)
                curveToRelative(0.0f, -6.541f, 6.325f, -11.642f, 13.184f, -9.499f)
                curveToRelative(2.991f, 0.94f, 5.383f, 3.321f, 6.313f, 6.313f)
                curveToRelative(2.141f, 6.858f, -2.96f, 13.183f, -9.5f, 13.183f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.017f, 18.139f)
                lineTo(8.152f, 18.139f)
                verticalLineToRelative(-3.866f)
                horizontalLineToRelative(3.865f)
                close()
                moveTo(8.152f, 21.098f)
                lineTo(5.193f, 21.098f)
                verticalLineToRelative(-2.959f)
                horizontalLineToRelative(2.959f)
                close()
                moveTo(5.193f, 18.139f)
                lineTo(2.711f, 18.139f)
                verticalLineToRelative(-2.483f)
                horizontalLineToRelative(2.482f)
                verticalLineToRelative(2.483f)
                close()
            }
        }
        .build()
        return _bxlDigitalocean!!
    }

private var _bxlDigitalocean: ImageVector? = null
