package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandWindows: ImageVector
    get() {
        if (_brandWindows != null) {
            return _brandWindows!!
        }
        _brandWindows = Builder(name = "BrandWindows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.57f, -1.248f, 2.832f, -2.715f, 2.923f)
                lineToRelative(-0.113f, 0.003f)
                lineToRelative(-0.042f, 0.018f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.336f, 0.056f)
                lineToRelative(-0.118f, -0.008f)
                lineToRelative(-4.676f, -0.585f)
                verticalLineToRelative(-7.407f)
                close()
                moveTo(11.0f, 13.0f)
                verticalLineToRelative(7.157f)
                lineToRelative(-5.3f, -0.662f)
                curveToRelative(-1.514f, -0.151f, -2.7f, -1.383f, -2.7f, -2.895f)
                verticalLineToRelative(-3.6f)
                close()
                moveTo(11.0f, 3.842f)
                verticalLineToRelative(7.158f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0.0f, -1.454f, 1.096f, -2.648f, 2.505f, -2.87f)
                close()
                moveTo(21.0f, 5.9f)
                verticalLineToRelative(5.1f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-7.409f)
                lineToRelative(4.717f, -0.589f)
                curveToRelative(1.759f, -0.145f, 3.283f, 1.189f, 3.283f, 2.898f)
            }
        }
        .build()
        return _brandWindows!!
    }

private var _brandWindows: ImageVector? = null
