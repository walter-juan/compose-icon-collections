package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ListBullet: ImageVector
    get() {
        if (_listBullet != null) {
            return _listBullet!!
        }
        _listBullet = Builder(name = "ListBullet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.625f, 6.75f)
                curveTo(2.625f, 6.129f, 3.129f, 5.625f, 3.75f, 5.625f)
                curveTo(4.371f, 5.625f, 4.875f, 6.129f, 4.875f, 6.75f)
                curveTo(4.875f, 7.371f, 4.371f, 7.875f, 3.75f, 7.875f)
                curveTo(3.129f, 7.875f, 2.625f, 7.371f, 2.625f, 6.75f)
                close()
                moveTo(7.5f, 6.75f)
                curveTo(7.5f, 6.336f, 7.836f, 6.0f, 8.25f, 6.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 6.0f, 21.0f, 6.336f, 21.0f, 6.75f)
                curveTo(21.0f, 7.164f, 20.664f, 7.5f, 20.25f, 7.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 7.5f, 7.5f, 7.164f, 7.5f, 6.75f)
                close()
                moveTo(2.625f, 12.0f)
                curveTo(2.625f, 11.379f, 3.129f, 10.875f, 3.75f, 10.875f)
                curveTo(4.371f, 10.875f, 4.875f, 11.379f, 4.875f, 12.0f)
                curveTo(4.875f, 12.621f, 4.371f, 13.125f, 3.75f, 13.125f)
                curveTo(3.129f, 13.125f, 2.625f, 12.621f, 2.625f, 12.0f)
                close()
                moveTo(7.5f, 12.0f)
                curveTo(7.5f, 11.586f, 7.836f, 11.25f, 8.25f, 11.25f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 11.25f, 21.0f, 11.586f, 21.0f, 12.0f)
                curveTo(21.0f, 12.414f, 20.664f, 12.75f, 20.25f, 12.75f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 12.75f, 7.5f, 12.414f, 7.5f, 12.0f)
                close()
                moveTo(2.625f, 17.25f)
                curveTo(2.625f, 16.629f, 3.129f, 16.125f, 3.75f, 16.125f)
                curveTo(4.371f, 16.125f, 4.875f, 16.629f, 4.875f, 17.25f)
                curveTo(4.875f, 17.871f, 4.371f, 18.375f, 3.75f, 18.375f)
                curveTo(3.129f, 18.375f, 2.625f, 17.871f, 2.625f, 17.25f)
                close()
                moveTo(7.5f, 17.25f)
                curveTo(7.5f, 16.836f, 7.836f, 16.5f, 8.25f, 16.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 16.5f, 21.0f, 16.836f, 21.0f, 17.25f)
                curveTo(21.0f, 17.664f, 20.664f, 18.0f, 20.25f, 18.0f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 18.0f, 7.5f, 17.664f, 7.5f, 17.25f)
                close()
            }
        }
        .build()
        return _listBullet!!
    }

private var _listBullet: ImageVector? = null
