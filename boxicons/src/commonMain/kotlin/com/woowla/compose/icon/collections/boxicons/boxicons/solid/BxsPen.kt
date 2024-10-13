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

public val SolidGroup.BxsPen: ImageVector
    get() {
        if (_bxsPen != null) {
            return _bxsPen!!
        }
        _bxsPen = Builder(name = "BxsPen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.587f, 6.999f)
                lineTo(7.702f, 6.999f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.88f, 1.316f)
                lineToRelative(-3.76f, 10.342f)
                curveToRelative(-0.133f, 0.365f, -0.042f, 0.774f, 0.232f, 1.049f)
                lineToRelative(0.293f, 0.293f)
                lineToRelative(6.422f, -6.422f)
                curveToRelative(-0.001f, -0.026f, -0.008f, -0.052f, -0.008f, -0.078f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, 1.5f)
                curveToRelative(-0.026f, 0.0f, -0.052f, -0.007f, -0.078f, -0.008f)
                lineToRelative(-6.422f, 6.422f)
                lineToRelative(0.293f, 0.293f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.049f, 0.232f)
                lineToRelative(10.342f, -3.761f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.316f, -1.88f)
                verticalLineToRelative(-3.885f)
                lineTo(19.0f, 10.414f)
                lineTo(13.586f, 5.0f)
                lineToRelative(-1.999f, 1.999f)
                close()
                moveTo(19.94f, 9.061f)
                lineTo(14.94f, 4.061f)
                lineTo(17.06f, 1.94f)
                lineTo(22.06f, 6.94f)
                close()
            }
        }
        .build()
        return _bxsPen!!
    }

private var _bxsPen: ImageVector? = null
