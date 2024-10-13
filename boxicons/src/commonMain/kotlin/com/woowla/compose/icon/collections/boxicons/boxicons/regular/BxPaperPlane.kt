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

public val RegularGroup.BxPaperPlane: ImageVector
    get() {
        if (_bxPaperPlane != null) {
            return _bxPaperPlane!!
        }
        _bxPaperPlane = Builder(name = "BxPaperPlane", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.56f, 3.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -0.08f)
                lineToRelative(-17.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.57f, 0.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.6f, 0.9f)
                lineTo(8.0f, 15.45f)
                verticalLineToRelative(6.72f)
                lineTo(13.84f, 18.0f)
                lineToRelative(4.76f, 2.08f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, 0.4f, 0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.52f, -0.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.48f, -0.79f)
                lineToRelative(1.0f, -15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.56f, 3.34f)
                close()
                moveTo(18.1f, 17.68f)
                lineToRelative(-5.27f, -2.31f)
                lineTo(16.0f, 9.17f)
                lineTo(8.35f, 13.42f)
                lineTo(5.42f, 12.13f)
                lineTo(18.89f, 5.79f)
                close()
            }
        }
        .build()
        return _bxPaperPlane!!
    }

private var _bxPaperPlane: ImageVector? = null
