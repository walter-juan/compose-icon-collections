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

public val LogosGroup.BxlFacebook: ImageVector
    get() {
        if (_bxlFacebook != null) {
            return _bxlFacebook!!
        }
        _bxlFacebook = Builder(name = "BxlFacebook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.397f, 20.997f)
                verticalLineToRelative(-8.196f)
                horizontalLineToRelative(2.765f)
                lineToRelative(0.411f, -3.209f)
                horizontalLineToRelative(-3.176f)
                verticalLineTo(7.548f)
                curveToRelative(0.0f, -0.926f, 0.258f, -1.56f, 1.587f, -1.56f)
                horizontalLineToRelative(1.684f)
                verticalLineTo(3.127f)
                arcTo(22.336f, 22.336f, 0.0f, false, false, 14.201f, 3.0f)
                curveToRelative(-2.444f, 0.0f, -4.122f, 1.492f, -4.122f, 4.231f)
                verticalLineToRelative(2.355f)
                horizontalLineTo(7.332f)
                verticalLineToRelative(3.209f)
                horizontalLineToRelative(2.753f)
                verticalLineToRelative(8.202f)
                horizontalLineToRelative(3.312f)
                close()
            }
        }
        .build()
        return _bxlFacebook!!
    }

private var _bxlFacebook: ImageVector? = null
