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

public val LogosGroup.BxlUnity: ImageVector
    get() {
        if (_bxlUnity != null) {
            return _bxlUnity!!
        }
        _bxlUnity = Builder(name = "BxlUnity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.4f, 17.8f)
                lineToRelative(1.21f, 2.07f)
                lineTo(19.77f, 22.0f)
                lineTo(22.0f, 14.08f)
                lineTo(20.72f, 12.0f)
                lineTo(22.0f, 10.0f)
                lineToRelative(-2.23f, -8.0f)
                lineToRelative(-8.16f, 2.13f)
                lineTo(10.4f, 6.2f)
                lineTo(8.0f, 6.2f)
                lineTo(2.0f, 12.0f)
                lineToRelative(6.0f, 5.81f)
                close()
                moveTo(20.32f, 12.0f)
                lineTo(18.59f, 18.0f)
                lineTo(15.0f, 12.0f)
                lineToRelative(3.59f, -6.0f)
                close()
                moveTo(10.6f, 6.54f)
                lineTo(16.84f, 5.0f)
                lineToRelative(-3.59f, 6.0f)
                lineTo(6.08f, 11.0f)
                close()
                moveTo(13.27f, 13.0f)
                lineToRelative(3.59f, 6.0f)
                lineToRelative(-6.26f, -1.55f)
                lineTo(6.1f, 13.0f)
                close()
            }
        }
        .build()
        return _bxlUnity!!
    }

private var _bxlUnity: ImageVector? = null
