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

public val SolidGroup.BxsCloudDownload: ImageVector
    get() {
        if (_bxsCloudDownload != null) {
            return _bxsCloudDownload!!
        }
        _bxsCloudDownload = Builder(name = "BxsCloudDownload", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.944f, 11.112f)
                curveTo(18.507f, 7.67f, 15.56f, 5.0f, 12.0f, 5.0f)
                curveTo(9.244f, 5.0f, 6.85f, 6.61f, 5.757f, 9.149f)
                curveTo(3.609f, 9.792f, 2.0f, 11.82f, 2.0f, 14.0f)
                curveToRelative(0.0f, 2.657f, 2.089f, 4.815f, 4.708f, 4.971f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.99f)
                verticalLineToRelative(-0.003f)
                lineTo(18.0f, 19.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(4.008f, 4.008f, 0.0f, false, false, -3.056f, -3.888f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-4.0f, 5.0f)
                lineToRelative(-4.0f, -5.0f)
                close()
            }
        }
        .build()
        return _bxsCloudDownload!!
    }

private var _bxsCloudDownload: ImageVector? = null
