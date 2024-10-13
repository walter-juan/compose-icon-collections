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

public val LogosGroup.BxlGmail: ImageVector
    get() {
        if (_bxlGmail != null) {
            return _bxlGmail!!
        }
        _bxlGmail = Builder(name = "BxlGmail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.73f, 5.41f)
                lineToRelative(-1.28f, 1.0f)
                lineTo(12.0f, 10.46f)
                lineTo(6.55f, 6.37f)
                lineToRelative(-1.28f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.05f)
                verticalLineToRelative(11.59f)
                arcTo(1.36f, 1.36f, 0.0f, false, false, 3.36f, 20.0f)
                horizontalLineToRelative(3.19f)
                verticalLineToRelative(-7.72f)
                lineTo(12.0f, 16.37f)
                lineToRelative(5.45f, -4.09f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(3.19f)
                arcTo(1.36f, 1.36f, 0.0f, false, false, 22.0f, 18.64f)
                verticalLineTo(7.05f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.27f, -1.64f)
                close()
            }
        }
        .build()
        return _bxlGmail!!
    }

private var _bxlGmail: ImageVector? = null
