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

public val LogosGroup.BxlCss3: ImageVector
    get() {
        if (_bxlCss3 != null) {
            return _bxlCss3!!
        }
        _bxlCss3 = Builder(name = "BxlCss3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.192f, 3.143f)
                horizontalLineToRelative(15.615f)
                lineToRelative(-1.42f, 16.034f)
                lineToRelative(-6.404f, 1.812f)
                lineToRelative(-6.369f, -1.813f)
                lineTo(4.192f, 3.143f)
                close()
                moveTo(16.9f, 6.424f)
                lineToRelative(-9.8f, -0.002f)
                lineToRelative(0.158f, 1.949f)
                lineToRelative(7.529f, 0.002f)
                lineToRelative(-0.189f, 2.02f)
                horizontalLineTo(9.66f)
                lineToRelative(0.179f, 1.913f)
                horizontalLineToRelative(4.597f)
                lineToRelative(-0.272f, 2.62f)
                lineToRelative(-2.164f, 0.598f)
                lineToRelative(-2.197f, -0.603f)
                lineToRelative(-0.141f, -1.569f)
                horizontalLineToRelative(-1.94f)
                lineToRelative(0.216f, 2.867f)
                lineTo(12.0f, 17.484f)
                lineToRelative(3.995f, -1.137f)
                lineToRelative(0.905f, -9.923f)
                close()
            }
        }
        .build()
        return _bxlCss3!!
    }

private var _bxlCss3: ImageVector? = null
