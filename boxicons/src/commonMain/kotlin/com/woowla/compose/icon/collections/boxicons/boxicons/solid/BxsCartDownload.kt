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

public val SolidGroup.BxsCartDownload: ImageVector
    get() {
        if (_bxsCartDownload != null) {
            return _bxsCartDownload!!
        }
        _bxsCartDownload = Builder(name = "BxsCartDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 19.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 19.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                lineTo(7.334f, 7.0f)
                lineTo(6.18f, 4.23f)
                arcTo(1.995f, 1.995f, 0.0f, false, false, 4.333f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.334f)
                lineToRelative(4.743f, 11.385f)
                curveToRelative(0.155f, 0.372f, 0.52f, 0.615f, 0.923f, 0.615f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.417f, 0.0f, 0.79f, -0.259f, 0.937f, -0.648f)
                lineToRelative(3.0f, -8.0f)
                arcTo(1.003f, 1.003f, 0.0f, false, false, 21.0f, 7.0f)
                close()
                moveTo(14.0f, 15.0f)
                lineTo(11.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bxsCartDownload!!
    }

private var _bxsCartDownload: ImageVector? = null
