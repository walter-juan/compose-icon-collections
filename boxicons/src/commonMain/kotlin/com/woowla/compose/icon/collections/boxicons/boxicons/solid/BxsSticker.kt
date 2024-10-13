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

public val SolidGroup.BxsSticker: ImageVector
    get() {
        if (_bxsSticker != null) {
            return _bxsSticker!!
        }
        _bxsSticker = Builder(name = "BxsSticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 11.0f)
                curveToRelative(-4.136f, 0.0f, -7.5f, 3.364f, -7.5f, 7.5f)
                curveToRelative(0.0f, 0.871f, 0.157f, 1.704f, 0.432f, 2.482f)
                lineToRelative(9.551f, -9.551f)
                arcTo(7.462f, 7.462f, 0.0f, false, false, 18.5f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.583f, 3.158f, 8.585f, 7.563f, 9.69f)
                arcTo(9.431f, 9.431f, 0.0f, false, true, 9.0f, 18.5f)
                curveTo(9.0f, 13.262f, 13.262f, 9.0f, 18.5f, 9.0f)
                curveToRelative(1.12f, 0.0f, 2.191f, 0.205f, 3.19f, 0.563f)
                curveTo(20.585f, 5.158f, 16.583f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsSticker!!
    }

private var _bxsSticker: ImageVector? = null
